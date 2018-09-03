CREATE TABLE IF NOT EXISTS supertable(
    st_id       INT NOT NULL AUTO_INCREMENT,
    st_text     VARCHAR(100),
    st_num      INT,
    st_date     DATE,
    st_float    FLOAT(10,2),

    PRIMARY KEY (st_id)
);