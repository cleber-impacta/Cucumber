package br.com.cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", 
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false)
public class Runner {

}

//snippet para gerar em camelCase
//dryRun validar os cenarios antes de tentar executar os testes, padrão false
//strict valida passos/mapeamento dos cenarios, padrao false