package com.example.invMgmtServer.Products.Repository;

public class ProductQueryBuilder {
    private StringBuilder query;

    private ProductQueryBuilder() {
        this.query = new StringBuilder();
    }

    public static ProductQueryBuilder select() {
        ProductQueryBuilder builder = new ProductQueryBuilder();
        builder.query.append("SELECT ");
        return builder;
    }

    public ProductQueryBuilder columns(String... columns) {
        for (String column : columns) {
            query.append(column).append(", ");
        }
        query.delete(query.length() - 2, query.length());
        query.append(" ");
        return this;
    }

    public ProductQueryBuilder fromTable(String tableName) {
        query.append("FROM ").append(tableName).append(" ");
        return this;
    }

    public ProductQueryBuilder where(String condition) {
        query.append("WHERE ").append(condition).append(" ");
        return this;
    }

    public ProductQueryBuilder orderBy(String column) {
        query.append("ORDER BY ").append(column).append(" ");
        return this;
    }

    public ProductQueryBuilder groupBy(String column) {
        query.append("GROUP BY ").append(column).append(" ");
        return this;
    }

    public String build() {
        return query.toString().trim();
    }
}
