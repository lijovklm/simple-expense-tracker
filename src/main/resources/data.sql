-- Spring Boot Data Initialization File.

-- Bootstrapping default categories

-- Food Related
insert into category(name) values('Food');
insert into category(name) values('Alcohol');
insert into category(name) values('Grocery');

-- Transport Related
insert into category(name) values('Fuel');
insert into category(name) values('Parking_Charges');
insert into category(name) values('Transport');

-- Regular and monthly
insert into category(name) values('Mobile');
insert into category(name) values('Internet');
insert into category(name) values('TV');
insert into category(name) values('Electricity');
insert into category(name) values('Gas');
insert into category(name) values('Maid');
insert into category(name) values('Apartment_Maintenance');
insert into category(name) values('Car_Maintenance');
insert into category(name) values('Kid_Care');

-- Ad Hoc
insert into category(name) values('Gift');
insert into category(name) values('Toys');
insert into category(name) values('Medicine');
insert into category(name) values('Accessories');
insert into category(name) values('Stationary');

-- Education and Career
insert into category(name) values('Education_Self');
insert into category(name) values('Education_Child');

-- Entertainment
insert into category(name) values('Movie');
insert into category(name) values('Entertainment_Kid');
insert into category(name) values('Entertainment_Other');

-- Charity and Help
insert into category(name) values('Charity');
