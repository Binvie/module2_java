-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
use furama;

select ma_nhan_vien,ho_ten from nhan_vien where ho_ten regexp '^[H,K,T]' and char_length(ho_ten) <=15;

-- 3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

SELECT 
    *
FROM
    khach_hang
WHERE
    (dia_chi LIKE '%Đà Nẵng%'
        OR dia_chi LIKE '%Quảng Trị%')
        AND TIMESTAMPDIFF(YEAR,
        ngay_sinh,
        CURDATE()) BETWEEN 18 AND 50;
        
  -- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo 
  -- số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
  
SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    count(hop_dong.ma_khach_hang) AS so_lan_dat_phong
FROM
    khach_hang
        JOIN
    hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        JOIN
    loai_khach ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
WHERE
    ten_loai_khach = "Diamond"
GROUP BY ma_khach_hang
order by so_lan_dat_phong;

-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
  
  select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, dich_vu.ten_dich_vu, hop_dong.ma_hop_dong,
  hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, dich_vu.chi_phi_thue + ifnull((hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia),0) as tong_tien
  from khach_hang
  left join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
  left join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
  left join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
  left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
  left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem;
  
  -- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các 
  -- loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
  
SELECT 
    dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN hop_dong ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
        JOIN khach_hang ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
        JOIN loai_dich_vu ON loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
WHERE
	hop_dong.ma_dich_vu not in
    (select hop_dong.ma_dich_vu from hop_dong where month(hop_dong.ngay_lam_hop_dong) < 4 and year(hop_dong.ngay_lam_hop_dong) = 2021 )
group by dich_vu.ma_dich_vu
order by ma_dich_vu;

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các 
-- loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

SELECT 
    dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, loai_dich_vu.ten_loai_dich_vu, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue
FROM
    dich_vu
	JOIN hop_dong ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
	JOIN loai_dich_vu ON loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
WHERE
	hop_dong.ma_dich_vu not in
    (select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) = 2021 )
group by dich_vu.ma_dich_vu
order by ma_dich_vu;
    
-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
(select distinct ho_ten from khach_hang);

select khach_hang.ho_ten from khach_hang group by ho_ten;

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.


