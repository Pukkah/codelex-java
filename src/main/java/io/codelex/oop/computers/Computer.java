package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    private String company;
    private String model;
    private String processor;
    private String graphicsCard;
    private int ramInGB;

    public Computer(String company, String model, String processor, String graphicsCard, int ramInGB) {
        this.company = company;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ramInGB = ramInGB;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public int getRamInGB() {
        return ramInGB;
    }

    public void setRamInGB(int ramInGB) {
        this.ramInGB = ramInGB;
    }

    @Override
    public String toString() {
        return "Computer: " +
                model +
                " by \"" + company +
                "\" Specs ->" +
                " Processor='" + processor + '\'' +
                ", Graphics Card='" + graphicsCard + '\'' +
                ", RAM='" + ramInGB + "GB'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return ramInGB == computer.ramInGB && Objects.equals(company, computer.company) && Objects.equals(model, computer.model) && Objects.equals(processor, computer.processor) && Objects.equals(graphicsCard, computer.graphicsCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, processor, graphicsCard, ramInGB);
    }

}
