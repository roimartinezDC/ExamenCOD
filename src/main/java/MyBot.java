import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import reactor.core.publisher.Mono;

public class MyBot {
    public static void main(String[] args) {
        DiscordClient client = DiscordClient.create("OTUzNjMzMDMyMDg5MjcyMzQw.YjHZ-A.EAiDkn7RQvQcX6WNjk3dSiKrWzM");

        Mono<Void> login = client.withGateway((GatewayDiscordClient gateway) -> Mono.empty());

        login.block();
    }
}