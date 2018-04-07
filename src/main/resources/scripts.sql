-- Table: public."RIDER"

-- DROP TABLE public."RIDER";

CREATE TABLE public."RIDER"
(
  "ID" numeric NOT NULL,
  "startingPoint" text,
  destination text,
  "currentlyBoarded" text,
  "VEHICLE_id" numeric,
  CONSTRAINT "RIDER_pkey" PRIMARY KEY ("ID")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."RIDER"
  OWNER TO postgres;

-- Table: public."ROUTE_SEGMENT"

-- DROP TABLE public."ROUTE_SEGMENT";

CREATE TABLE public."ROUTE_SEGMENT"
(
  "routeSegmentId" numeric NOT NULL,
  "routeSegmentStartPoint" numeric,
  "routeSegmentEndPoint" numeric,
  "averageSpeed" double precision,
  "averageVariableSpeed" double precision,
  "hourOfTheDay" numeric,
  "routeType" text,
  CONSTRAINT "ROUTE_SEGMENT_pkey" PRIMARY KEY ("routeSegmentId")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."ROUTE_SEGMENT"
  OWNER TO postgres;

-- Table: public."Route_Segment_Group"

-- DROP TABLE public."Route_Segment_Group";

CREATE TABLE public."Route_Segment_Group"
(
  "routeSegmentGroupId" numeric NOT NULL,
  "routeId" numeric,
  "routeSegmentId" numeric,
  "ORDERofSEGMENTS" numeric,
  CONSTRAINT "Route_Segment_Group_pkey" PRIMARY KEY ("routeSegmentGroupId")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Route_Segment_Group"
  OWNER TO postgres;

-- Table: public."Stop"

-- DROP TABLE public."Stop";

CREATE TABLE public."Stop"
(
  "ID" numeric NOT NULL,
  "STOPTYPE" text,
  "LATITUDE" double precision,
  "LONGITUDE" double precision,
  CONSTRAINT "Stop_pkey" PRIMARY KEY ("ID")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Stop"
  OWNER TO postgres;

-- Table: public."Vehicle"

-- DROP TABLE public."Vehicle";

CREATE TABLE public."Vehicle"
(
  id numeric NOT NULL,
  "vehicleType" text,
  "VEHILCE_number" text,
  "currentlyRunning" text,
  direction text,
  "maxCapacity" integer,
  "currentPassengers" integer,
  "startTime" timestamp without time zone,
  "endTime" timestamp without time zone,
  CONSTRAINT "Vehicle_pkey" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Vehicle"
  OWNER TO postgres;

-- Table: public."VehicleRoute"

-- DROP TABLE public."VehicleRoute";

CREATE TABLE public."VehicleRoute"
(
  id numeric NOT NULL,
  "vehicleId" numeric,
  "routeId" numeric,
  CONSTRAINT "VehicleRoute_pkey" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."VehicleRoute"
  OWNER TO postgres;

-- Table: public."Vehicle_Travel_History"

-- DROP TABLE public."Vehicle_Travel_History";

CREATE TABLE public."Vehicle_Travel_History"
(
  "vehicleTravelHistoryId" numeric NOT NULL,
  "startingPoint" numeric,
  destination numeric,
  "hourOfTheDay" numeric,
  "travelDate" date,
  CONSTRAINT "Vehicle_Travel_History_pkey" PRIMARY KEY ("vehicleTravelHistoryId")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."Vehicle_Travel_History"
  OWNER TO postgres;
-- Table: public.route

-- DROP TABLE public.route;

CREATE TABLE public.route
(
  "routeId" numeric NOT NULL,
  "startingPoint" text,
  destination text,
  "typeOfRoute" text,
  direction text,
  CONSTRAINT route_pkey PRIMARY KEY ("routeId")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.route
  OWNER TO postgres;


