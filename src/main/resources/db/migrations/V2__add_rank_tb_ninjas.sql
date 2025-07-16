-- V2: migration to add rank column in tb_ninjas --

ALTER TABLE tb_ninjas
ADD COLUMN rank VARCHAR(255);