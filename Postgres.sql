CREATE TABLE public.client_center (
	id varchar(36) GENERATED ALWAYS AS (((json ->> 'id'::text))) STORED NOT NULL,
	"name" varchar(256) GENERATED ALWAYS AS (((json ->> 'name'::text))) STORED NOT NULL,
	"json" jsonb NOT NULL,
	updatedat int8 GENERATED ALWAYS AS ((json ->> 'updatedAt'::text)::bigint) STORED NOT NULL,
	updatedby varchar(256) GENERATED ALWAYS AS (((json ->> 'updatedBy'::text))) STORED NOT NULL,
	deleted bool GENERATED ALWAYS AS ((json ->> 'deleted'::text)::boolean) STORED NULL,
	namehash varchar(256) NOT NULL,
	CONSTRAINT client_center_namehash_key UNIQUE (namehash),
	CONSTRAINT client_center_pkey PRIMARY KEY (id)
);


CREATE INDEX idx_name_client_center ON public.client_center USING btree (name);



CREATE TABLE public.knowledge_center (
	id varchar(36) GENERATED ALWAYS AS (((json ->> 'id'::text))) STORED NOT NULL,
	"name" varchar(256) GENERATED ALWAYS AS (((json ->> 'name'::text))) STORED NOT NULL,
	"json" jsonb NOT NULL,
	updatedat int8 GENERATED ALWAYS AS ((json ->> 'updatedAt'::text)::bigint) STORED NOT NULL,
	updatedby varchar(256) GENERATED ALWAYS AS (((json ->> 'updatedBy'::text))) STORED NOT NULL,
	deleted bool GENERATED ALWAYS AS ((json ->> 'deleted'::text)::boolean) STORED NULL,
	namehash varchar(256) NOT NULL,
	CONSTRAINT knowledge_center_namehash_key UNIQUE (namehash),
	CONSTRAINT knowledge_center_pkey PRIMARY KEY (id)
);


CREATE INDEX idx_name_knowledge_center ON public.knowledge_center USING btree (name);


CREATE TABLE public.client_center_client (
	id varchar(36) GENERATED ALWAYS AS (((json ->> 'id'::text))) STORED NOT NULL,
	"json" jsonb NOT NULL,
	updatedat int8 GENERATED ALWAYS AS ((json ->> 'updatedAt'::text)::bigint) STORED NOT NULL,
	updatedby varchar(256) GENERATED ALWAYS AS (((json ->> 'updatedBy'::text))) STORED NOT NULL,
	deleted bool GENERATED ALWAYS AS ((json ->> 'deleted'::text)::boolean) STORED NULL,
	fqnhash varchar(768) NOT NULL,
	"name" varchar(256) GENERATED ALWAYS AS (((json ->> 'name'::text))) STORED NOT NULL,
	CONSTRAINT client_center_client_fqnhash_key UNIQUE (fqnhash),
	CONSTRAINT client_center_client_pkey PRIMARY KEY (id)
);
CREATE INDEX idx_name_client_center_client ON public.client_center_client USING btree (name);


CREATE TABLE public.knowledge_center_document (
	id varchar(36) GENERATED ALWAYS AS (((json ->> 'id'::text))) STORED NOT NULL,
	"json" jsonb NOT NULL,
	updatedat int8 GENERATED ALWAYS AS ((json ->> 'updatedAt'::text)::bigint) STORED NOT NULL,
	updatedby varchar(256) GENERATED ALWAYS AS (((json ->> 'updatedBy'::text))) STORED NOT NULL,
	deleted bool GENERATED ALWAYS AS ((json ->> 'deleted'::text)::boolean) STORED NULL,
	fqnhash varchar(768) NOT NULL,
	"name" varchar(256) GENERATED ALWAYS AS (((json ->> 'name'::text))) STORED NOT NULL,
	CONSTRAINT knowledge_center_document_fqnhash_key UNIQUE (fqnhash),
	CONSTRAINT knowledge_center_document_pkey PRIMARY KEY (id)
);
CREATE INDEX idx_name_knowledge_center_document ON public.knowledge_center_document USING btree (name);


------------

