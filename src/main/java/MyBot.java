import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import reactor.core.publisher.Mono;

public class MyBot {
    public static void main(String[] args) {
        //Utilizamos el DiscordClient, que es la clase necesaria para interacutar con Discord
        //creamos uno con el token de nuestro bot, el cual obtuve en el portal para desarrolladores de Discord, al crear el bot en mi aplicación
        DiscordClient client = DiscordClient.create("OTUzNjMzMDMyMDg5MjcyMzQw.YjHZ-A.EAiDkn7RQvQcX6WNjk3dSiKrWzM");

        //Iniciamos sesión y le indicamos que hacer al bot con lo contenido en client.withGateway
        //al poner Mono.empty estamos diciendo que no haga nada
        Mono<Void> login = client.withGateway((GatewayDiscordClient gateway) -> Mono.empty());

        login.block();
    }
}