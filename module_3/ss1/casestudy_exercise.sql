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
    (select hop_dong.ma_dich_vu 
    from hop_dong 
    where month(hop_dong.ngay_lam_hop_dong) < 4 
    and year(hop_dong.ngay_lam_hop_dong) = 2021 )
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

select month(hop_dong.ngay_lam_hop_dong) as thang, count(month(hop_dong.ngay_lam_hop_dong)) as so_luong_khach_hang
from hop_dong
group by thang
order by thang;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong,
--  ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).


select hd.ma_hop_dong, hd.ngay_lam_hop_dong, ifnull(sum(so_luong),0) as so_luong_dich_vu_di_kem
from hop_dong hd
left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
group by  hd.ma_hop_dong;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach 
-- là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select dvdk.ten_dich_vu_di_kem, dvdk.ma_dich_vu_di_kem
from khach_hang kh
left join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
left join hop_dong_chi_tiet hdct  on hdct.ma_hop_dong = hd.ma_hop_dong
left join dich_vu_di_kem dvdk  on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
left join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach
where ten_loai_khach = 'Diamond'
and kh.dia_chi like '%Vinh' or '%Quảng Ngãi%';

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), -tien_dat_coc của tất cả các dịch vụ đã từng được khách
--  hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select hd.ma_hop_dong, nv.ma_nhan_vien, kh.ho_ten, kh.so_dien_thoai, dv.ten_dich_vu, nv.ho_ten as ten_nhan_vien, hd.tien_dat_coc,
ifnull(sum(hdct.so_luong),0) as so_luong_dich_vu_di_kem
from khach_hang kh 
left join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
left join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
left join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
left join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach
left join nhan_vien nv on nv.ma_nhan_vien = hd.ma_nhan_vien
where (month(hd.ngay_lam_hop_dong) > 9 and year(hd.ngay_lam_hop_dong))= 2020 not in 
(select hd.ma_hop_dong 
from hop_dong 
where month(hd.ngay_lam_hop_dong) < 7 and year(hd.ngay_lam_hop_dong) - 2021)
group by hd.ma_hop_dong;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong) as so_lan_su_dung
from dich_vu_di_kem dvdk
left join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
left join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong
group by ma_dich_vu_di_kem
having so_lan_su_dung  in
(select max(hop_dong_chi_tiet.so_luong)
from hop_dong_chi_tiet);

 -- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
 -- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu,
 -- ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
 
 SELECT 
    hd.ma_hop_dong, dv.ten_dich_vu, dvdk.ten_dich_vu_di_kem,
    COUNT(dvdk.ma_dich_vu_di_kem) AS so_lan_su_dung
FROM hop_dong hd
        JOIN hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
        JOIN dich_vu dv ON dv.ma_dich_vu = hd.ma_dich_vu
        JOIN dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by hdct.ma_dich_vu_di_kem
having so_lan_su_dung = 1;
 
 -- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do,
 -- ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
 
 select nv.ma_nhan_vien, nv.ho_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai,
 nv.dia_chi, count(hd.ma_nhan_vien)
 from nhan_vien nv
 join hop_dong hd on hd.ma_nhan_vien = nv.ma_nhan_vien
 join trinh_do td on td.ma_trinh_do = nv.ma_trinh_do
 join bo_phan bp on bp.ma_bo_phan = nv.ma_bo_phan
 group by ma_nhan_vien
 having count(hd.ma_nhan_vien) < 3;

 -- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
 
 select nv.ma_nhan_vien, nv.ho_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai,
 nv.dia_chi
 from nhan_vien nv
 left join hop_dong hd on hd.ma_nhan_vien = nv.ma_nhan_vien
 left join trinh_do td on td.ma_trinh_do = nv.ma_trinh_do
 left join bo_phan bp on bp.ma_bo_phan = nv.ma_bo_phan
 group by ma_nhan_vien
 having count(hd.ma_nhan_vien) = 0;

 -- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
 -- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021
 -- là lớn hơn 10.000.000 VNĐ.
 
 set sql_mode = 0;
 select kh.ma_khach_hang, kh.ho_ten,lk.ma_loai_khach,lk.ten_loai_khach, dv.chi_phi_thue + ifnull((hdct.so_luong * dvdk.gia),0) as tong_tien
 from khach_hang kh 
 join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach
 join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
 join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
 join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
 join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
 group by kh.ma_khach_hang
 having lk.ten_loai_khach = 'Platinium' 
 and tong_tien > 100000;
 

 
 
 

