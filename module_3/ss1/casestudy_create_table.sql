create database furama;
use furama;
create table vi_tri(
	ma_vi_tri int auto_increment,
    ten_vi_tri varchar(45),
	primary key (ma_vi_tri)
);
insert into vi_tri value (1, "Quản Lý"),(2, "Nhân Viên");

create table trinh_do(
	ma_trinh_do int,
    ten_trinh_do varchar(45),
	primary key (ma_trinh_do)
);

create table bo_phan(
	ma_bo_phan int,
    ten_bo_phan varchar(45),
	primary key (ma_bo_phan)
);

create table nhan_vien(
	ma_nhan_vien int,
    ho_ten varchar(45),
    ngay_sinh date,
    so_cmnd varchar(45),
    luong double,
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
	primary key (ma_nhan_vien),
    ma_vi_tri int,
    ma_trinh_do int,
    ma_bo_phan int,
    foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
    foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
    foreign key (ma_bo_phan) references bo_phan(ma_bo_phan)
);
-- select * from nhan_vien;
-- insert into furama.nhan_vien value
-- (1, "Nguyễn Văn An", "1970-11-07", "456231786", 10000000, "0901234121", "annguyen@gmail.com", "295 Nguyễn Tất Thành, Đà Nẵng", 1, 3, 1),
-- (2, "Lê Văn Bình", "1997-04-09", "654231234", 7000000, "0934212314", "binhlv@gmail.com", "22 Yên Bái, Đà Nẵng", 1, 2, 2),
-- (3, "Hồ Thị Yến", "1995-12-12", "999231723", 14000000, "0412352315", "thiyen@gmail.com", "K234/11 Điện Biên Phủ, Gia Lai", 1, 3, 2),
-- (4, "Võ Công Toản", "1980-04-04", "123231365", 17000000, "0374443232", "toan0404@gmail.com", "77 Hoàng Diệu, Quảng Trị", 1, 4, 4),
-- (5, "Nguyễn Bỉnh Phát", "1999-12-09", "454363232", 6000000, "0902341231", "phatphat@gmail.com", "43 Yên Bái, Đà Nẵng", 2, 1, 1),
-- (6, "Khúc Nguyễn An Nghi", "2000-11-08", "964542311", 7000000, "0978653213", "annghi20@gmail.com", "294 Nguyễn Tất Thành, Đà Nẵng", 2, 2, 3),
-- (7,"Nguyễn Hữu Hà", "1993-01-01", "534323231", 8000000, "0941234553", "nhh0101@gmail.com", "4 Nguyễn Chí Thanh, Huế", 2, 3, 2),
-- (8, "Nguyễn Hà Đông", "1989-09-03", "234414123", 9000000, "0642123111", "donghanguyen@gmail.com", "111 Hùng Vương, Hà Nội", 2, 4, 4),
-- (9, "Tòng Hoang", "1982-09-03", "256781231", 6000000, "0245144444",	"hoangtong@gmail.com", "213 Hàm Nghi, Đà Nẵng", 2, 4, 4),
-- (10, "Nguyễn Công Đạo", "1994-01-08", "755434343", 8000000, "0988767111", "nguyencongdao12@gmail.com", "6 Hoà Khánh, Đồng Nai", 2, 3, 2);

create table loai_khach(
ma_loai_khach int,
ten_loai_khach varchar(45),
primary key (ma_loai_khach)
);

create table khach_hang(
	ma_khach_hang int,
    ma_loai_khach int,
    foreign key (ma_loai_khach) references loai_khach(ma_loai_khach),
    ho_ten varchar(45),
    ngay_sinh date,
    gioi_tinh bit(1),
    so_cmnd varchar(45),
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    primary key (ma_khach_hang)
);

create table loai_dich_vu(
ma_loai_dich_vu int,
ten_loai_dich_vu varchar(45),
primary key (ma_loai_dich_vu)
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(45),
trang_thai varchar(45)
);

create table kieu_thue(
ma_kieu_thue int ,
ten_kieu_thue varchar(45),
primary key (ma_kieu_thue)
);

create table dich_vu(
ma_dich_vu int primary key,
ten_dich_vu varchar(45),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
ma_kieu_thue int,
ma_loai_dich_vu int,
foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
dich_vu_mien_phi_di_kem text
);

create table hop_dong(
ma_hop_dong int primary key,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
ma_nhan_vien int,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
ma_khach_hang int,
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
ma_dich_vu int,
foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key,
ma_hop_dong int,
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
ma_dich_vu_di_kem int,
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem),
so_luong int
);
drop database furama;




