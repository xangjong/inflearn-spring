drop table if exists member CASCADE;
crate table member
(
    id bigint generated by default as identity,
    name varhcar(255),
    primary key (id)
)
