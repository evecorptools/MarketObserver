
CREATE TABLE `oauth2_authorized_client` (
    `client_registration_id` varchar(100) NOT NULL,
    `principal_name` varchar(200) NOT NULL,
    `access_token_type` varchar(100) NOT NULL,
    `access_token_value` text NOT NULL,
    `access_token_issued_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `access_token_expires_at` timestamp NULL DEFAULT NULL,
    `access_token_scopes` varchar(1000) DEFAULT NULL,
    `refresh_token_value` text,
    `refresh_token_issued_at` timestamp NULL DEFAULT NULL,
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`client_registration_id`,`principal_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `character_publicinfo` (
    `characterid` bigint NOT NULL,
    `allianceid` int,
    `ancestryid` int,
    `birthday` timestamp,
    `bloodlineid` int,
    `corporationid` int,
    `description` TEXT,
    `factionid` int,
    `gender` varchar(100),
    `name` varchar(250),
    `raceid` int,
    `securitystatus` float,
    `title` varchar(250),
    PRIMARY KEY (`characterid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
