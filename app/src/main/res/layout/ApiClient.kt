package layout

import java.net.URI.create

object ApiClientuk {
    interface ApiInterface {
        object ApiClient {
            var client = OkHttpClient.Builder().build()

            var retrofit = Retrofit.Buider()
                .baseUrl("https://courses-service.herokuapp.com/")
                .
                (GsonConverterFactory.create())
                .client(client)
                .build()

            fun <T> buildService(service: Class<T>): T {
                return retrofit.create(service)
            }
}

        enum class OkHttpClient {
            ;

            class Builder {
                fun build(): Any {

                }

            }

        }

        class Retrofit {
            class Buider {
                fun baseUrl(s: String): Any {

                }

            }

        }

        class GsonConverterFactory {

        }

