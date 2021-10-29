CREATE DATABASE postgres;
CREATE TABLE public.t01_solicitud (
	id serial4 NOT NULL,
	estado int4 NULL,
	fecha_ingreso date NULL,
	monto int4 NULL,
	id_cliente varchar(20) NULL,
	CONSTRAINT t01_solicitud_pkey PRIMARY KEY (id)
);
CREATE UNIQUE INDEX indx_id_cliente ON public.t01_solicitud USING btree (id_cliente);
CREATE UNIQUE INDEX t01_solicitud_pkey ON public.t01_solicitud USING btree (id);