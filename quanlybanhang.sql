create database QUANLYHANGHOA;
use QUANLYHANGHOA;
create table KHACHHANG(
	Ma_KH char(6) primary key,
	Ho_Ten nvarchar(40),
	Ngay_Sinh datetime,
	Gioi_Tinh nchar(3),
	So_DT_KH char(11),
	Dia_Chi_KH nvarchar(200) );
create table LOAI(
	Ma_Loai char(4) primary key,
	Mo_Ta nvarchar(200) );
create table NHACUNGCAP(
	Ma_NCC char(5) primary key,
	Ten_NCC nvarchar(50),
	So_DT_NCC char(11),
	Dia_Chi_NCC nvarchar(200));
create table HANGHOA(
	Ma_HH char(10) primary key,
	Ten_HH nvarchar(50),
	Ma_Loai char(4) ,
	Ma_NCC char(5) ,
	Gia int);
create table NHAPHANG(
	Ma_HH char(10) not null,
	Ngay_Nhap datetime not null,
	SL_Nhap int,
	primary key(Ma_HH,Ngay_Nhap));
create table BANHANG(
	Ma_HH char(10) not null,
	Ngay_Ban datetime not null,
	SL_Ban int,
	primary key(Ma_HH,Ngay_Ban));
create table DONHANG(
	Ma_DH char(6) primary key,
	Ma_KH char(6),
	Ngay_Lap datetime);
create table CHITIETDONHANG(
	Ma_DH char(6) not null,
	Ma_HH char(10) not null,
	So_Luong int,
	Gia int,
	primary key (Ma_DH, Ma_HH));
drop table chitietdonhang;
drop table donhang;
-- foreign key
alter table HANGHOA add constraint fk_HH_LOAI foreign key( Ma_Loai) references LOAI(Ma_Loai);
alter table HANGHOA add constraint fk_HH_NCC foreign key( Ma_NCC) references NHACUNGCAP(Ma_NCC);
alter table DONHANG add constraint fk_DH_KH foreign key(Ma_KH) references KHACHHANG(Ma_KH);
alter table CHITIETDONHANG add constraint fk_CTDH_HH foreign key(Ma_HH) references HANGHOA(Ma_HH);
alter table CHITIETDONHANG add constraint fk_CTDH_DH foreign key(STT_DH) references DONHANG(STT_DH);
alter table NHAPHANG add constraint fk_NH_HH foreign key(Ma_HH) references HANGHOA(Ma_HH);
alter table BANHANG add constraint fk_BH_HH foreign key(Ma_HH) references HANGHOA(Ma_HH);
-- 
delimiter $$
create function tinhtien(madh char(6))
returns int
begin	
	declare cost int;
	set cost=(select SUM(So_Luong*Gia) from chitietdonhang where Ma_DH=madh);
	return cost;
end$$


