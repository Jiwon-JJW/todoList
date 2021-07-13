package todoList.controller;

import org.springframework.stereotype.Controller;
import todoList.service.CardService;

@Controller
public class CardController {

    CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }
}
