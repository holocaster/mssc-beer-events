package br.com.prcompany.beerevents.events;

import br.com.prcompany.beerevents.model.BeerOrderDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderResult implements Serializable {

    private BeerOrderDTO beerOrderDTO;
    private boolean allocationError;
    private boolean pendingInventory;
}
