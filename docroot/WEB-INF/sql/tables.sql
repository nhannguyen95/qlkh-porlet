create table QLKH_HangTrongKho (
	MaKho VARCHAR(75) not null,
	MaHang VARCHAR(75) not null,
	SoLuong LONG,
	primary key (MaKho, MaHang)
);

create table QLKH_KhoHang (
	MaKho VARCHAR(75) not null primary key,
	TenKho VARCHAR(75) null,
	DiaDiem VARCHAR(75) null
);

create table QLKH_MatHang (
	MaHang VARCHAR(75) not null primary key,
	TenHang VARCHAR(75) null,
	GiaThanh VARCHAR(75) null
);