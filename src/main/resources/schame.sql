create table `tb_area`(
`area_id` int not null primary key  auto_increment,
`area_name` varchar(200) not null unique ,
`priority` int not null default '0',
`create_time` timestamp ,
`last_edit_time` timestamp
)engine=InnoDB default charset=utf8;