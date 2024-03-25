

# LocationsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Location name |  |
|**country** | **String** | Country two letter abbreviation |  |
|**formattedAddress** | **String** | Full address |  [optional] |
|**state** | **String** | State or province |  [optional] |
|**city** | **String** | City |  [optional] |
|**latitude** | **String** | locations latitude coordinates |  [optional] |
|**longitude** | **String** | locations longitude coordinates |  [optional] |
|**placeId** | **String** | Google Places location Id |  [optional] |
|**timezone** | **String** | Timezone. Valid zone info name |  [optional] |
|**holidayPay** | **Boolean** | When true, holiday pay is enabled |  [optional] |
|**sunHoursClose** | **String** | Sunday closing time |  [optional] |
|**monHoursClose** | **String** | Monday closing time |  [optional] |
|**tueHoursClose** | **String** | Tuesday closing time |  [optional] |
|**wedHoursClose** | **String** | Wednesday closing time |  [optional] |
|**thuHoursClose** | **String** | Thursday closing time |  [optional] |
|**friHoursClose** | **String** | Friday closing time |  [optional] |
|**satHoursClose** | **String** | Saturday closing time |  [optional] |
|**sunHoursOpen** | **String** | Sunday opening time |  [optional] |
|**monHoursOpen** | **String** | Monday opening time |  [optional] |
|**tueHoursOpen** | **String** | Tuesday opening time |  [optional] |
|**wedHoursOpen** | **String** | Wednesday opening time |  [optional] |
|**thuHoursOpen** | **String** | Thursday opening time |  [optional] |
|**friHoursOpen** | **String** | Friday opening time |  [optional] |
|**satHoursOpen** | **String** | Saturday opening time |  [optional] |
|**sunIsClosed** | **Boolean** | If true, location is closed on Sunday |  [optional] |
|**monIsClosed** | **Boolean** | If true, location is closed on Monday |  [optional] |
|**tueIsClosed** | **Boolean** | If true, location is closed on Tuesday |  [optional] |
|**wedIsClosed** | **Boolean** | If true, location is closed on Wednesday |  [optional] |
|**thuIsClosed** | **Boolean** | If true, location is closed on Thursday |  [optional] |
|**friIsClosed** | **Boolean** | If true, location is closed on Friday |  [optional] |
|**satIsClosed** | **Boolean** | If true, location is closed on Saturday |  [optional] |
|**enableShiftFeedback** | **Boolean** | If true end of shift feedback requests are enabled |  [optional] |
|**shiftFeedback** | **Boolean** | If true end of shift feedback requests are enabled |  [optional] |
|**coupon** | **String** | Optional coupon to apply to this location&#39;s billing |  [optional] |
|**stripeTokenId** | **String** | Optional stripe payment token. If this is not provided, the account&#39;s default payment information will be used. |  [optional] |
|**copyFromId** | **Integer** | Optional existing location id whose department and role structure the new location should copy |  [optional] |



