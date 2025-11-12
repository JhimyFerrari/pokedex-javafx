package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

import com.database.database;
import com.entities.Pokemon;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private Label poke;
    private Label tipos;
    private Label evolucao;
    private Pokemon pokemonEscolhido;
    private Image obj;
    private ImageView iv;

    @Override
    public void start(Stage stage) throws IOException {
        database bd = new database();
        bd.inicialize();
        System.out.println(bd.buscaPokemonByNome("Ivysaur"));
        ;
        poke = new Label("");

        tipos = new Label("");
        evolucao = new Label("");

        HBox telaPrincipal = new HBox();

        VBox vBoxListaPokemons = new VBox();
        vBoxListaPokemons.setMinWidth(200);
        vBoxListaPokemons.setAlignment(Pos.CENTER);
        vBoxListaPokemons.setSpacing(3);
        for (int i = 1; i < 150; i++) {
            Pokemon lacoRepeticao = bd.buscaPokemonById(i);

            Button botao = new Button(lacoRepeticao.getNome());
            botao.setMinWidth(120);
            botao.setOnAction(e -> atualizacao(lacoRepeticao));
            vBoxListaPokemons.getChildren().add(botao);
        }

        ScrollPane scrollPaneListaPokemons = new ScrollPane();
        scrollPaneListaPokemons.setContent(vBoxListaPokemons);
        scrollPaneListaPokemons.setMinWidth(200);
        telaPrincipal.getChildren().add(scrollPaneListaPokemons);

        VBox apresentacao = new VBox();
        telaPrincipal.getChildren().add(apresentacao);

        obj = new Image(getClass().getResourceAsStream("/image/poke_nada.png"));
        iv = new ImageView(obj);
        iv.setFitWidth(300);
        iv.setPreserveRatio(true);

        apresentacao.getChildren().add(poke);
        apresentacao.getChildren().add(iv);
        apresentacao.setMinWidth(340);
        apresentacao.setAlignment(Pos.TOP_CENTER);

        HBox informacoes = new HBox();
        apresentacao.getChildren().add(informacoes);

        VBox tipos_tela = new VBox();
        VBox evolucao_tela = new VBox();

        tipos_tela.getChildren().add(tipos);
        evolucao_tela.getChildren().add(evolucao);

        informacoes.getChildren().add(tipos_tela);
        informacoes.getChildren().add(evolucao_tela);

        scene = new Scene(telaPrincipal, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        launch();
    }

    public void atualizacao(Pokemon p) {
        poke.setText(p.getNome());
        tipos.setText(p.getTiposInString());

        System.out.println();
        evolucao.setText((p.getEvoluiPara() != null) ? p.getEvoluiPara().getNome() : "");
        String uri = "/image/" + String.format("%03d", p.getNumero()) + ".png";

        System.out.println(uri);
        obj = new Image(getClass().getResourceAsStream(uri));

        iv.setImage(obj);

    }

}