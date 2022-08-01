using masterData as MD from '../db/schema';

service BPService 
{
entity BusinessPartners as projection on MD.BusinessPartners;
}