-- V3: migration to add imgUrl column in tb_ninjas --

ALTER TABLE tb_ninjas
ADD COLUMN imgUrl VARCHAR(255);