package br.ucsal.account_service;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

    private final AccountConfig accountConfig;

    public MessageController(AccountConfig accountConfig) {
        this.accountConfig = accountConfig;
    }

    @GetMapping("/message")
    public String getMessage() {
        return accountConfig.getMessage();
    }
}
