package nextstep.jdbc.executor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@FunctionalInterface
public interface QueryExecutor<T> {

    T execute(PreparedStatement preparedStatement) throws SQLException;
}