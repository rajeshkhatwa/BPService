namespace masterData;

using {
    cuid,
    managed,
    temporal,
    sap,
    Country
} from '@sap/cds/common';

entity BusinessPartners {
    key BusinessPartner : String(30);
    Status : String(20);
    FirstName : String;
    LastName : String;
    Email : String;
    Phone : String;
    CountryCode : String;
    C4CID : String;
    }