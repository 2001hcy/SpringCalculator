package kr.hs.dgsw.calculator;

import javax.script.ScriptException;

public interface CalculatorService {
    String Calculate(String formula) throws ScriptException, Exception;
}
