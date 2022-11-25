package bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponseDTO {
    @NotNull
    private ClientDTO client;
    @NotNull
    private AccountDTO account;
    @NotNull
    private CardDTO card;
}
