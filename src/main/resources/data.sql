comment '사용자';

create index idx_deleted_at
    on users (deleted_at);

create index idx_created_at
    on users (created_at);

create index idx_email
    on users (email);

create index idx_name
    on users (name);

create index idx_email_and name
    on users (email, name);

create index id_users_id
    on blogs (users_id);
s
INSERT INTO users (NAME, EMAIL, PASSWORD, AUTHORIZATION, CREATED_AT) VALUES ('변진환', 'whydda@naver.com', '1234','USER', CURRENT_TIMESTAMP(3));

INSERT INTO blogs (USERS_ID, TITLE, CONTENT, CREATED_AT) VALUES (1, 'Blog 제목 1', '블로그 내용', CURRENT_TIMESTAMP(3));