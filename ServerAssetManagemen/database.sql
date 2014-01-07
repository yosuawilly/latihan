create table condition(
id_condition serial not null primary key,
condition_name varchar(10)
);

insert into condition (condition_name) values ('Baik'),('rusak');

create table category(
id_category serial not null primary key,
category_name varchar(20)
);

insert into category (category_name) values ('Meja Kursi'),('Pendingin');

create table location(
id_location serial not null primary key,
location varchar(30)
);

insert into location (location) values ('Fakultas Teknik'),('BAAK'),('Reception'),('LPPM'),('BAU');

create table status_maintenance(
id_status serial not null primary key,
status varchar(20)
);

insert into status_maintenance (status) values ('in progress'),('in schedule');

create table asset(
id_asset serial not null primary key,
asset varchar(30) not null,
id_condition int references condition on update cascade on delete cascade,
id_category int references category on update cascade on delete cascade,
id_location int references location on update cascade on delete cascade,
departemen varchar(30),
acquired_date date,
current_value double precision,
purchase_price double precision,
manufacturer varchar(30),
description text,
comment varchar(30),
model varchar(30),
schedule_interval int,
estimasi_waktu int
);

create table maintenance_schedule(
id_maintenance serial not null primary key,
id_asset int references asset on update cascade on delete cascade,
comment_status varchar(20),
estimasi_waktu int,
pic varchar(30),
id_status int references status_maintenance on update cascade on delete cascade,
tanggal_awal date,
tanggal_selesai date
);