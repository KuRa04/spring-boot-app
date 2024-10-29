# set up the container.
FROM mysql:8.0-debian

# install vim.
RUN apt-get update && \
    apt-get install -y vim && \
    rm -rf /var/lib/apt/lists/* && \
    apt-get clean

# add encoding setting to .vimrc file.
RUN echo ':set encoding=utf-8' >> /root/.vimrc

# set utf-8 encoding and mysql root password.
ENV LANG=ja_JP.UTF-8
ENV MYSQL_ROOT_PASSWORD=password

# copy the init sql file to the init dir.
COPY init_db.sql /docker-entrypoint-initdb.d/
