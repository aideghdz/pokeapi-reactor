package skaro.pokeapi;

import org.springframework.beans.factory.annotation.Value;

import java.net.URI;

import javax.validation.constraints.NotNull;

public class PokeApiConfigurationProperties {

	@NotNull
	@Value("${skaro.pokeapi.base-uri}")
	private URI baseUri;

	public URI getBaseUri() {
		return baseUri;
	}

	public void setBaseUri(URI baseUri) {
		this.baseUri = baseUri;
	}
	
}
