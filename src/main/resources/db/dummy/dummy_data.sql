-- Categories
INSERT INTO categories (name) VALUES
                                  ('Electronics'),
                                  ('Books'),
                                  ('Home & Kitchen'),
                                  ('Sports & Outdoors'),
                                  ('Clothing');

-- Users with hashed passwords (example using bcrypt format)
INSERT INTO users (name, email, password) VALUES
                                              ('John Doe', 'john.doe@example.com', '$2a$10$xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'),
                                              ('Jane Smith', 'jane.smith@example.com', '$2a$10$xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'),
                                              ('Bob Wilson', 'bob.wilson@example.com', '$2a$10$xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');

-- Addresses
INSERT INTO addresses (street, city, state, zip, user_id) VALUES
                                                              ('123 Main St', 'New York', 'NY', '10001', 1),
                                                              ('456 Oak Ave', 'Los Angeles', 'CA', '90001', 1),
                                                              ('789 Pine Rd', 'Chicago', 'IL', '60601', 2),
                                                              ('321 Maple Dr', 'Houston', 'TX', '77001', 3);

-- Products
INSERT INTO products (name, price, description, category_id) VALUES
                                                                 ('4K Smart TV', 699.99, 'Ultra HD Smart Television with HDR', 1),
                                                                 ('Wireless Headphones', 129.99, 'Noise-canceling Bluetooth headphones', 1),
                                                                 ('The Art of Programming', 49.99, 'Comprehensive guide to software development', 2),
                                                                 ('Coffee Maker', 79.99, 'Programmable 12-cup coffee maker', 3),
                                                                 ('Yoga Mat', 29.99, 'Premium non-slip exercise mat', 4),
                                                                 ('Running Shoes', 89.99, 'Lightweight breathable running shoes', 4),
                                                                 ('Winter Jacket', 159.99, 'Waterproof insulated winter coat', 5);

-- Profiles
INSERT INTO profiles (id, bio, phone_number, date_of_birth, loyalty_points) VALUES
                                                                                (1, 'Tech enthusiast and coffee lover', '555-0101', '1985-03-15', 150),
                                                                                (2, 'Passionate about books and travel', '555-0102', '1990-07-22', 75),
                                                                                (3, 'Sports and outdoor activities fan', '555-0103', '1988-11-30', 200);

-- Wishlist
INSERT INTO wishlist (product_id, user_id) VALUES
                                               (1, 2),
                                               (3, 1),
                                               (4, 3),
                                               (2, 1),
                                               (5, 2);