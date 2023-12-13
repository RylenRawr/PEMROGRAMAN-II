package com.example.modul_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));


        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("name"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Mahasiswa(1, "Audrey", "7000"));
        tableView.getItems().add(
                new Mahasiswa(2, "Dandellion", "7001"));
        tableView.getItems().add(
                new Mahasiswa(3, "Deyya", "7002"));
        tableView.getItems().add(
                new Mahasiswa(4, "Aina", "7003"));
        tableView.getItems().add(
                new Mahasiswa(5, "Dawan", "7004"));
        tableView.getItems().add(
                new Mahasiswa(6, "Helenah", "7005"));
        tableView.getItems().add(
                new Mahasiswa(7, "Lidama", "7006"));
        tableView.getItems().add(
                new Mahasiswa(8, "Aninda", "7007"));
        tableView.getItems().add(
                new Mahasiswa(9, "Isanhabang", "7008"));
        tableView.getItems().add(
                new Mahasiswa(10, "IrfanStis", "7009"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}