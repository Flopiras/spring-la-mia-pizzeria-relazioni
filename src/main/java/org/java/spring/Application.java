package org.java.spring;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		pizzaService.save(new Pizza("Margherita", "mozzarella, pomodoro", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Diavola", "mozzarella, pomodoro, salame piccante", "https://wips.plug.it/cips/buonissimo.org/cms/2012/05/69630013_m.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Rustica", "pomodoro, mozzarella di bufala, peperoni, melanzane, zucchine", "https://www.fruttaweb.com/consigli/wp-content/uploads/2018/06/pizza-vegana.jpg", 8.5f));
		pizzaService.save(new Pizza("Sbriciolata", "mozzarella, pomodoro, salsiccia, pecorino", "https://blog.giallozafferano.it/incucinaconmary/wp-content/uploads/2012/09/pizap.com10.823721832130104313479955621741.jpg", 8.5f));
		pizzaService.save(new Pizza("Americana", "mozzarella, pomodoro, wurstel, patatine fritte", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/11/3244_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Hawaiana", "mozzarella, pomodoro, ananas", "https://garage.pizza/wp-content/uploads/2022/08/International-pineapple-pizza-day-570x570.jpg", 8.5f));
		pizzaService.save(new Pizza("Parmigiana", "mozzarella, pomodoro, melanzane fritte, parmigiano", "https://www.ricettedellanonna.net/wp-content/uploads/2014/09/pizza_rustica_aslla_parmigiana.1-620x465.jpg", 8.5f));
		pizzaService.save(new Pizza("4 Stagioni", "mozzarella, pomodoro, prosciutto crudo, carciofi, funghi, olive", "https://www.ricettedalmondo.it/images/foto-ricette/p/29526-pizza-quattro-stagioni.jpg", 8.5f));
		pizzaService.save(new Pizza("4 Formaggi", "mozzarella, provola, gorgonzola, parmigiano", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/06/3234_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Pere e gorgonzola", "mozzarella, pere, gorgonzola, noci", "https://i1.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2021/07/4750_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Tonno e cipolla", "mozzarella, tonno, cipolla", "https://i1.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/10/3245_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		
		
	}

}
