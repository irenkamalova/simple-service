package rates.services;


import rates.adapter.ExchangeRatesAdapter;
import model.ExchangeRatesResponse;

import io.reactivex.Single;

public class ExchangeRatesServiceImpl implements ExchangeRatesService {
	
	private ExchangeRatesAdapter exchangeRatesAdapter;
	
	public ExchangeRatesServiceImpl(ExchangeRatesAdapter exchangeRatesAdapter) {
		
		this.exchangeRatesAdapter = exchangeRatesAdapter;
	}
	
	public Single<ExchangeRatesResponse> getExchangeRates(final String base) {
		
		return exchangeRatesAdapter.getExchangeRates(base);
	}	
}
