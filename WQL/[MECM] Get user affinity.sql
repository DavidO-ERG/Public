select SMS_R_SYSTEM.ResourceID,SMS_R_SYSTEM.ResourceType,SMS_R_SYSTEM.Name,SMS_R_SYSTEM.SMSUniqueIdentifier,SMS_R_SYSTEM.ResourceDomainORWorkgroup,SMS_R_SYSTEM.Client 
from SMS_R_System
JOIN SMS_UserMachineRelationship ON SMS_R_System.ResourceID=SMS_UserMachineRelationship.MachineResourceID
JOIN SMS_R_User ON SMS_UserMachineRelationship.UniqueUserName = SMS_R_User.UniqueUserName 
WHERE SMS_UserMachineRelationship.RelationActive=1 AND SMS_R_User.UserOUName = "XXXXXXXXXX"