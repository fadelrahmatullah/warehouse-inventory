CREATE TABLE t_users (
    user_id BIGINT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE t_inventory (
    product_id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantity INTEGER NOT NULL,
    product_type VARCHAR(100) NOT NULL
);

CREATE TABLE t_borrowings (
    borrowing_id BIGINT PRIMARY KEY,
    user_id INTEGER REFERENCES t_users(user_id),
    product_id INTEGER REFERENCES t_inventory(product_id),
    borrow_date DATE NOT NULL,
    return_date DATE,
    quantity INTEGER NOT NULL,
    return_quantity INTEGER,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES t_users(user_id),
    CONSTRAINT fk_product FOREIGN KEY (product_id) REFERENCES t_inventory(product_id)
);
