module com.projekt.projektfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens com.projekt.projektfx.entities to org.hibernate.orm.core;
    exports com.projekt.projektfx.entities;
    opens com.projekt.projektfx to javafx.fxml;
    exports com.projekt.projektfx;
}