create database bai_tap1;

use bai_tap1;

create table nha_cc(
ma_ncc int ,
ten_ncc varchar(45),
dia_chi varchar(45),
primary key (ma_ncc)
);

create table phone(
so_dien_thoai varchar(12),
ma_ncc int,
primary key (so_dien_thoai),
foreign key (ma_ncc) references nha_cc(ma_ncc)
);

create table don_dh(
so_dh int ,
ngay_dh date,
ma_ncc int,
primary key (so_dh),
foreign key (ma_ncc) references nha_cc(ma_ncc)
);

create table phieu_nhap(
so_pn int ,
ngay_nhap date,
primary key (so_pn)
);

create table phieu_xuat(
so_px int,
ngay_xuat date,
primary key (so_px)
);

create table vat_tu(
ma_vt int,
ten_vt varchar(100),
primary key (ma_vt)
);

create table chi_tiet_phieu_xuat(
sl_xuat int,
dg_xuat varchar(100),
ma_vt int,
so_px int,
primary key (ma_vt,so_px),
foreign key (ma_vt) references vat_tu(ma_vt),
foreign key (so_px) references phieu_xuat(so_px)
);

create table chi_tiet_phieu_nhap(
dg_nhap double,
sl_nhap int,
so_pn int,
ma_vt int,
primary key (so_pn,ma_vt),
foreign key (so_pn) references phieu_nhap(so_pn),
foreign key (ma_vt) references vat_tu(ma_vt)
);

create table chi_tiet_don_dat_hang (
	ma_vt int,
    so_dh int,
	primary key (ma_vt,so_dh),
    foreign key (ma_vt) references vat_tu(ma_vt),
    foreign key (so_dh) references don_dh(so_dh)
);
-- drop database bai_tap1;