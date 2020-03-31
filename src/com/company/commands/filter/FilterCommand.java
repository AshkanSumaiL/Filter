package com.company.commands.filter;
import com.company.commands.Interface.Command;
import java.util.ArrayList;
import java.util.List;

public class FilterCommand extends Command {
    protected List<String> data;
    protected String type;
    public FilterCommand(String type,String params, List<String> data) {
        super(params);
        this.data=data;
        this.type=type;
        execute();
    }

    @Override
    public void execute(){
        System.out.println(filter());
    }

    public List<String> filter(){
        System.out.println(type);

        if(type.equals("int")){
            return filterNumber();
        }
        if(type.equals("string")){
            return filterWord();
        }
        else {
            System.out.println("Data Type not defined");
            return new ArrayList<>();
        }
    }

    private List<String> filterWord(){
        if(params.equals("PALINDROME")){
            return WordFilter.palindrome(data);
        }
        if(params.equals("ALL_VOWELS")){
            return WordFilter.allVowels(data);
        }
        if(params.equals("DIPHTHONG")){
            return WordFilter.diphthong(data);
        }
        if(params.equals("TRIPHTHONG")){
            return WordFilter.triphthong(data);
        }
        else {
            System.out.println("FILTER NOT FOUND");
            return new ArrayList<>();
        }
    }

    private List<String> filterNumber(){
        if(params.equals("EVEN")){
            return NumberFilter.even(data);
        }
        if(params.equals("ODD")){
            return NumberFilter.odd(data);
        }
        if(params.equals("PALINDROME")){
            return NumberFilter.palindrome(data);
        }
        if(params.equals("PRIME")){
            return NumberFilter.prime(data);
        }
        if(params.equals("MULTIPLE_OF_7")){
            return NumberFilter.multipleOf7(data);
        }
        if(params.equals("MULTIPLE_OF_11")){
            return NumberFilter.multipleOf11(data);
        }
        else {
            System.out.println("FILTER NOT FOUND");
            return new ArrayList<>();
        }
    }
}
