# Gunakan image resmi PostgreSQL dari Docker Hub
FROM postgres:latest

# Lingkungan untuk konfigurasi default
ENV POSTGRES_USER=myuser
ENV POSTGRES_PASSWORD=mysecretpassword
ENV POSTGRES_DB=mydatabase

# Expose port yang akan digunakan oleh PostgreSQL (default 5432)
EXPOSE 5432

CMD ["postgres"]
