package mx.uv.practica11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@SpringBootApplication

public class Practica11Application {

    Color color = new Color();
	List<Color> colores = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(Practica11Application.class, args);
	}

	//API relativo a los colores
    // curl -X PUT -d @color.json -H "Content-Type: application/json" http://localhost:8080/color
	@RequestMapping (method = RequestMethod.PUT, value= "/colores")
	String cambiarColor (@RequestBody Color objeto){
        System.out.println(objeto);
        color = objeto;
		return "color cambiado";
	}
	@RequestMapping (method = RequestMethod.DELETE, value= "/colores/{id}")
	Color eliminarColor (@PathVariable String id){
        System.out.println(id);
        color = null;
		return color;
	}
	//curl -X GET http://localhost:8080/color?nombreColor=blanco&valor=255
	@RequestMapping (method = RequestMethod.GET, value= "/colores")
	List<Color> listarColor (@RequestParam (required = false, defaultValue = "", name = "id") String id){
	//List<Color> listarColor (@RequestParam Optional<String> id){
		if(id != ""){
			List<Color> colores = new ArrayList<>();
			colores.add(this.colores.get(Integer.parseInt(id)));
			return colores;
		}
		return colores;
	}

	//Recibe objetos de tipo application/json
	@RequestMapping (method = RequestMethod.POST, value= "/colores")
	//String crearColores(@RequestBody Color color){
	Object crearColores(@RequestBody Color color){
        //color.setNombreColor("Blanco");
        //color.setValorColor("255");
		String id = UUID.randomUUID().toString();
		color.setId(id);
		colores.add(color);
        System.out.println(color.getNombreColor());
		Properties resultado = new Properties();
		resultado.setProperty("id", id);
        //return "color creado";
		return resultado;
	}

	@RequestMapping (method = RequestMethod.POST, value= "/colorespost")
	//String crearColores(@RequestBody Color color){
	String crearColoresPost(@RequestParam String nombreColor, String valorColor){
		System.out.println(nombreColor);
		System.out.println(valorColor);
        return "color creado";

	}
}