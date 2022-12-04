package org.example;

public class Main{
    private int id;
    private String name;
    private int pages;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages= pages;
    }

    @Override
    public String toString() {
        return  "Main [id=" + id + ", name="+ name +", pages=" + pages + "] ";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 :name.hashCode());
        result = prime * result + pages;
        return result;

    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Main other = (Main) obj;
        if(id != other.id)
            return false;
        if(name == null) {
            if (other.name != null)
                return false;
        } else if(!name.equals(other.name))
                return false;
        if(pages != other.pages)
            return false;
        return true;
    }

    public  Main(){
        super();
    }

    public Main(int id ,String name , int pages)    {
        super();
        this.id = id;
        this.name = name;
        this.pages =pages;
    }


}