package kr.hs.dgsw.calculator;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String Calculate(String formula) throws Exception{
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return engine.eval(formula).toString();
    }
}
