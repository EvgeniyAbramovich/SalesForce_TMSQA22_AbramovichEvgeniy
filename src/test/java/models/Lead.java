package models;

import enums.*;

import java.util.Objects;

public class Lead {

    private final String firstName;
    private final String lastName;
    private final String company;
    private final String phone;
    private final String email;
    private final String title;
    private final String street;
    private final String website;
    private final String city;
    private final String state;
    private final String postalCode;
    private final String country;
    private final String noOfEmployees;
    private final String annualRevenue;
    private final String description;
    private LeadStatus leadStatus;
    private Rating rating;
    private Salutation salutation;
    private LeadSource leadSource;
    private Industry industry;
    private final String name;
    private final String address;


    private Lead(LeadBuilder leadBuilder) {
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.phone = leadBuilder.phone;
        this.email = leadBuilder.email;
        this.title = leadBuilder.title;
        this.street = leadBuilder.street;
        this.website = leadBuilder.website;
        this.city = leadBuilder.city;
        this.state = leadBuilder.state;
        this.postalCode = leadBuilder.postalCode;
        this.country = leadBuilder.country;
        this.noOfEmployees = leadBuilder.noOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.description = leadBuilder.description;
        this.leadStatus = leadBuilder.leadStatus;
        this.rating = leadBuilder.rating;
        this.salutation = leadBuilder.salutation;
        this.leadSource = leadBuilder.leadSource;
        this.industry = leadBuilder.industry;
        this.name = leadBuilder.name;
        this.address = leadBuilder.address;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCompany() {
        return company;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getTitle() {
        return title;
    }
    public String getStreet() {
        return street;
    }
    public String getWebsite() {
        return website;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCountry() {
        return country;
    }
    public String getNoOfEmployees() {
        return noOfEmployees;
    }
    public String getAnnualRevenue() {
        return annualRevenue;
    }
    public String getDescription() {
        return description;
    }
    public LeadStatus getLeadStatus() {
        return leadStatus;
    }
    public Rating getRating() {
        return rating;
    }
    public Salutation getSalutation() {
        return salutation;
    }
    public LeadSource getLeadSource() {
        return leadSource;
    }
    public Industry getIndustry() {
        return industry;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return firstName.equals(lead.firstName)
                && lastName.equals(lead.lastName)
                && company.equals(lead.company)
                && phone.equals(lead.phone)
                && email.equals(lead.email)
                && title.equals(lead.title)
                && street.equals(lead.street)
                && website.equals(lead.website)
                && city.equals(lead.city)
                && state.equals(lead.state)
                && postalCode.equals(lead.postalCode)
                && country.equals(lead.country)
                && noOfEmployees.equals(lead.noOfEmployees)
                && annualRevenue.equals(lead.annualRevenue)
                && description.equals(lead.description)
                && leadStatus.equals(lead.leadStatus)
                && rating.equals(lead.rating)
                && salutation.equals(lead.salutation)
                && leadSource.equals(lead.leadSource)
                && industry.equals(lead.industry)
                && name.equals(lead.name)
                && address.equals(lead.address);

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, phone, email, title, street, website, city, state, postalCode,
                country, noOfEmployees, annualRevenue, description, leadStatus, rating, salutation, leadSource,
                industry, name, address);
    }

    @Override
    public String toString() {
        return "Lead {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", street='" + street + '\'' +
                ", website='" + website + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", noOfEmployees='" + noOfEmployees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                ", leadStatus='" + leadStatus + '\'' +
                ", rating='" + rating + '\'' +
                ", salutation='" + salutation + '\'' +
                ", leadSource='" + leadSource + '\'' +
                ", industry='" + industry + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class LeadBuilder {

        private String firstName;
        private String lastName;
        private String company;
        private String phone;
        private String email;
        private String title;
        private String street;
        private String website;
        private String city;
        private String state;
        private String postalCode;
        private String country;
        private String noOfEmployees;
        private String annualRevenue;
        private String description;
        private LeadStatus leadStatus;
        private Rating rating;
        private Salutation salutation;
        private LeadSource leadSource;
        private Industry industry;
        private String name;
        private String address;

        public LeadBuilder(String name) {

        }


        public LeadBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public LeadBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public LeadBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public LeadBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public LeadBuilder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public LeadBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder setNoOfEmployees(String noOfEmployees) {
            this.noOfEmployees = noOfEmployees;
            return this;
        }

        public LeadBuilder setAnnualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public LeadBuilder setLeadStatus(LeadStatus leadStatus) {
            this.leadStatus = leadStatus;
            return this;
        }

        public LeadBuilder setRating(Rating rating) {
            this.rating = rating;
            return this;
        }
        public LeadBuilder setSalutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }
        public LeadBuilder setLeadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }
        public LeadBuilder setIndustry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public Lead build(){
            return new Lead(this);

        }


    }
}
