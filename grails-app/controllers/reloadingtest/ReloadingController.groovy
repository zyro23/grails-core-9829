package reloadingtest


class ReloadingController {

	ReloadingService reloadingService

	def index() {
		reloadingService.foo()
		render "test"
	}

}
