package com.interfaces.pckg.exercise11;

public
class StringAdapter implements Processor{
    private Shifter shifter;

    public StringAdapter(Shifter s){
        shifter = s;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        String ret = shifter.shift((String) input);
        return ret;
    }

}