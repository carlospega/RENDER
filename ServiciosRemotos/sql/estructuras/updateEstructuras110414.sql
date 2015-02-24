-- Table: "NAPS"
CREATE TABLE "naps"
(
idnap character varying NOT NULL,
  nap character varying NOT NULL,
  CONSTRAINT naps_pkey PRIMARY KEY (idnap)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "naps"
  OWNER TO postgres;

