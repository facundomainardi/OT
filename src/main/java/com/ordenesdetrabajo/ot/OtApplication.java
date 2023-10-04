package com.ordenesdetrabajo.ot;

import com.ordenesdetrabajo.ot.model.*;
import com.ordenesdetrabajo.ot.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class OtApplication {

	//@Autowired
	//PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(OtApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(PersonalRepository personalRepository , SocioRepository socioRepository,
									  ServicioRepository servicioRepository, ServicioXSocioRepository servicioXSocioRepository,
									  CuadrillaRepository cuadrillaRepository, OrdenDeTrabajoRepository ordenDeTrabajoRepository,
									  UsaurioRepository usaurioRepository) {
		return (args) -> {
			// save a couple of client
				Personal personal = new Personal("Juan Facundo", "Mainardi"
					, "facundomainrdi@gmail.com", "33512538", Cargo.JEFE);

			Personal personal2 = new Personal("Jose", "Marozzi"
					, "jose@gmail.com", "33512589", Cargo.EMPLEADO);
			Personal personal3 = new Personal("Jaime", "Maine"
					, "jaime@gmail.com", "111111111", Cargo.EMPLEADO);

			personalRepository.save(personal);
			personalRepository.save(personal2);
			personalRepository.save(personal3);

			Socio socio = new Socio("Pepe", "Argento", "pepe@gmail.com", "33512538", "Alte Brown", 283, Estado.ACTIVO);

			socioRepository.save(socio);

			Servicio servicio = new Servicio("INTERNET FIBRACOOP", "Servicio de internet por Fibra Optica");
			Servicio servicio2 = new Servicio("TELEVISION POR CABLE", "Servicio de Television por cable");

			servicioRepository.save(servicio);
			servicioRepository.save(servicio2);

			ServicioXSocio servicioXSocio = new ServicioXSocio(servicio, socio, Categoria.EMPRESA);

			servicioXSocioRepository.save(servicioXSocio);

			Cuadrilla cuadrilla = new Cuadrilla("TELECOMUNICACIONES1");

			cuadrillaRepository.save(cuadrilla);

			cuadrilla.addPersonal(personal);
			cuadrilla.addPersonal(personal3);

			cuadrillaRepository.save(cuadrilla);
			personalRepository.save(personal);
			personalRepository.save(personal2);
			personalRepository.save(personal3);
			cuadrillaRepository.save(cuadrilla);

			Usuario usuario = new Usuario("Facu", "1234", personal);

			usaurioRepository.save(usuario);

			OrdenDeTrabajo ordenDeTrabajo = new OrdenDeTrabajo(
					LocalDateTime.now(), cuadrilla, servicioXSocio,"NO TIENE BUENA VELOCIDAD", Estado.PENDIENTE
					);

			ordenDeTrabajoRepository.save(ordenDeTrabajo);


		};
	}
}
