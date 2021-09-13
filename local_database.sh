#!/bin/bash
docker rm -f postgresql_dev
docker run -d -p 5432:5432 --name postgresql_dev -e POSTGRES_PASSWORD="postgres" -e POSTGRES_DB=financeiro postgres