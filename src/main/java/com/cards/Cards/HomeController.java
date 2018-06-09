package com.cards.Cards;

import javax.servlet.http.HttpSession;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cards.Cards.model.Deck;

@Controller
@SessionAttributes("deckId")
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index(HttpSession session, Model model) {
		ModelAndView mv = new ModelAndView("index");
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
		
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		Deck deck = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Deck.class);
		//mv.addObject("deck", deck);
		
		
		//by adding this as an attribute to the model we can use the reference to the name in the @SessionAttribute
		model.addAttribute("deckId", deck.getDeckId());
		System.out.println(model.toString());
		String http = "https://deckofcardsapi.com/api/deck/"+deck.getDeckId()+"/draw/?count=5";
		System.out.println(http);
		Deck deck2 = restTemplate.getForObject(http, Deck.class);
		System.out.println(deck2.getCard());
		mv.addObject("deck", deck2);
		
		return mv;
	}
}
