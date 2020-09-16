/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fatec.jpa.eventoapp;

import org.flywaydb.core.Flyway;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:mysql://localhost:3306/fatec_db", "root", "password")
                .locations("classpath:db/migration")
                .load();

        flyway.migrate();
        System.out.println(new App().getGreeting());
    }
}
